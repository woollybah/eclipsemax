package net.brucey.dltk.blitzmax.debugger.dbgp;

import java.util.TreeMap;

public class BlitzMaxFeatures {

  private TreeMap<String, Feature> features;

  public BlitzMaxFeatures() {
    init();
  }

  public void init() {
    features = new TreeMap<String, Feature>();

    addFeature(false, "language_supports_threads", "1");
    addFeature(false, "language_name", "BlitzMax");
    addFeature(false, "language_version", "1.33");
    addFeature(false, "encoding", "UTF-8");
    addFeature(false, "protocol_version", "1");
    addFeature(false, "supports_async", "0");
    addFeature(false, "data_encoding", "base64");
    addFeature(false, "breakpoint_languages", "");

    addFeature(true, "multiple_sessions", "0");
    addFeature(true, "max_children", "100");
    addFeature(true, "max_data", "4096");
    addFeature(true, "max_depth", "3");

    addFeature(false, "supports_postmortem", "0");
    addFeature(true, "show_hidden", "0");
    addFeature(true, "notify_ok", "0");

  }

  public boolean isSupported(String name) {
    return features.containsKey(name);
  }

  public String getValue(String name) {
    if (isSupported(name)) {
      return features.get(name).value;
    } else {
      return null;
    }
  }

  private void addFeature(boolean modifiable, String name, String value) {
    features.put(name, new Feature(modifiable, name, value));
  }

  private class Feature {
    private boolean modifiable;
    private String name;
    private String value;

    public Feature(boolean modifiable, String name, String value) {
      this.modifiable = modifiable;
      this.name = name;
      this.value = value;
    }
  }

  public boolean setValue(String name, String value) {
    if (isSupported(name)) {
      Feature feature = features.get(name);

      if (feature.modifiable) {
        feature.value = value;
        return true;
      }
    }

    return false;
  }
}
