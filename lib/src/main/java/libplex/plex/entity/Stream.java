package libplex.plex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public class Stream {
    @XmlAttribute private int id;
    @XmlAttribute private int streamType;
    @XmlAttribute private int selected;
    @XmlAttribute private String codec;
    @XmlAttribute private int index;
    @XmlAttribute private int channels;
    @XmlAttribute private int bitrate;
    @XmlAttribute private double albumGain;
    @XmlAttribute private double albumPeak;
    @XmlAttribute private double albumRange;
    @XmlAttribute private String audioChannelLayout;
    @XmlAttribute private int bitDepth;
    @XmlAttribute private double gain;
    @XmlAttribute private double loudness;
    @XmlAttribute private double lra;
    @XmlAttribute private double peak;
    @XmlAttribute private int samplingRate;
    @XmlAttribute private String displayTitle;
    @XmlAttribute private String extendedDisplayTitle;
}
