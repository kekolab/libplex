package libplex.plex.entity.adapter;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class IntegerListAdapter extends XmlAdapter<String, List<Integer>> {

	@Override
	public List<Integer> unmarshal(String v) throws Exception {
		return Stream.of(v.split(Pattern.quote(",")))
				.map(a -> Integer.parseInt(a))
				.collect(Collectors.toList());
	}

	@Override
	public String marshal(List<Integer> v) throws Exception {
		return v.stream()
				.map(a -> Integer.toString(a))
				.reduce(null, (a, b) -> a == null ? b
						: a.concat(",")
								.concat(b));
	}

}