package libplex.plex.entity;

import java.util.Date;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class TimestampAdapter extends XmlAdapter<String, Date> {

	@Override
	public Date unmarshal(String v) throws Exception {
		return new Date(Long.parseLong(v) * 1000);
	}

	@Override
	public String marshal(Date v) throws Exception {
		return Long.toString(v.getTime() / 1000);
	}

}