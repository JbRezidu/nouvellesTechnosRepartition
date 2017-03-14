package premierWebServiceClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.jws.WebService;

@WebService(targetNamespace = "http://premierWebServiceClass/", portName = "MyServiceImplPort", serviceName = "MyServiceImplService")
public class MyServiceImpl implements MyServiceItf {

	@Override
	public int ajoute(int a, int b) {
		return a + b;
	}

	@Override
	public Collection<String> recupereList(String unmot, String unautre) {
		List<String> ll = new ArrayList<String>();
		ll.add(unmot);
		ll.add(unautre);
		return ll;
	}

}
