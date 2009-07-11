package net.brucey.dltk.blitzmax.debugger.dbgp;

import java.util.LinkedList;

public class DataBuffer {

  // list of byte[] data
  private LinkedList<byte[]> data;
  private byte[] remaining;

  public DataBuffer() {
    data = new LinkedList<byte[]>();
  }

  public void addLineBasedData(byte[] newData, int length) {
    int last = -1;

    for (int i = 0; i < length; i++) {

      // ASCII 10 is a newline
      if (newData[i] == 10) {

        // trim out ASCII 13
        int trim = 0;
        if (i > 1 && newData[i - 1] == 13) {
          trim = 1;
        }

        int size = i - last - trim;
        if (remaining != null) {
          size += remaining.length;
        }

        byte[] b = new byte[size - 1];

        if (remaining != null) {
          System.arraycopy(remaining, 0, b, 0, remaining.length);
          System.arraycopy(newData, last + 1, b, remaining.length, i - last - 1
              - trim);
          remaining = null;
        } else {
          System.arraycopy(newData, last + 1, b, 0, i - last - 1 - trim);
        }
        last = i;

        data.add(b);
      }
    }

    // if we have data left over, hold onto it for adding to the next chunk.
    if (last + 1 < length) {
      remaining = new byte[length - last];
      System.arraycopy(newData, last + 1, remaining, 0, length - last);
    }

  }

  public void addNullBasedData(byte[] newData, int length) {
    int last = -1;

    for (int i = 0; i < length; i++) {

      // ASCII 0 is the end of data
      if (newData[i] == 0) {

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

    // if we have data left over, hold onto it for adding to the next chunk.
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

  public byte[] readBytes() {
    return data.remove();
  }
}
