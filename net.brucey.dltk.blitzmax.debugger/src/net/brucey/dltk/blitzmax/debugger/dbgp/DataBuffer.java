package net.brucey.dltk.blitzmax.debugger.dbgp;

import java.util.LinkedList;

public class DataBuffer {

  // list of byte[] data
  private LinkedList<byte[]> data;
  private byte[] remaining;

  public DataBuffer() {
    data = new LinkedList<byte[]>();
  }

  public void addData(byte[] newData, int length) {
    int last = -1;

    for (int i = 0; i < length; i++) {

      if (newData[i] == 10) {

        int size = i - last;
        if (remaining != null) {
          size += remaining.length;
        }

        byte[] b = new byte[size - 1];

        if (remaining != null) {
          System.arraycopy(remaining, 0, b, 0, remaining.length);
          System
              .arraycopy(newData, last + 1, b, remaining.length, i - last - 1);
          remaining = null;
        } else {
          System.arraycopy(newData, last + 1, b, 0, i - last - 1);
        }
        last = i;

        data.add(b);
      }
    }

    if (last + 1 < length) {
      remaining = new byte[length - last];
      System.arraycopy(newData, last + 1, remaining, 0, length - last);
    }

  }

  public boolean lineAvail() {
    return !data.isEmpty();
  }

  public String readLine() {
    return new String(data.remove());
  }
}
