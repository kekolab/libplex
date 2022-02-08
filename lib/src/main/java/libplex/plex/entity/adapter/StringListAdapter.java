package libplex.plex.entity.adapter;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class StringListAdapter extends XmlAdapter<String, List<String>> {

	@Override
	public List<String> unmarshal(String v) throws Exception {
		return Stream.of(v.split(Pattern.quote(",")))
				.collect(Collectors.toList());
	}

	@Override
	public String marshal(List<String> v) throws Exception {
		return v.stream()
				.reduce(null, (t, u) -> t == null ? u
						: t.concat(",")
								.concat(u));
	}

}