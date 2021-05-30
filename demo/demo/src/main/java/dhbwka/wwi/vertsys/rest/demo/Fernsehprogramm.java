package dhbwka.wwi.vertsys.rest.demo;
import java.util.ArrayList; 
import java.util.List;
import org.springframework.stereotype.*;

@Service
public class Fernsehprogramm {
	private static final List<FernsehprogrammEintrag> Eingang = new ArrayList<>();
	
	public void addEingang(FernsehprogrammEintrag name) {
		Eingang.add(name);
	}
	
	public List<FernsehprogrammEintrag> getEingang(){
		return Eingang;
	}
}

//Legt Liste an, mit Eingängen der Sendernamen 