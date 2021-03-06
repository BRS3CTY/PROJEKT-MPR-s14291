package repos;

import java.util.List;

import domain.EnumerationValue;
import domain.User;

public interface IEnumerationVR extends IRepository<EnumerationValue>{
	public List<EnumerationValue> withName(String name);
	public List<EnumerationValue> withIntKey(int key, String name);
	public List<EnumerationValue> withStringKey(String key, String name);

}
