package dhbwka.wwi.vertsys.rest.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fernsehprogramm")
public class FernsehprogrammController {
	@Autowired
	private Fernsehprogramm fernsehprogramm;
	@GetMapping 
	public List<FernsehprogrammEintrag> getAlleSender(){
		return this.fernsehprogramm.getEingang();
	}
	
	//Erfragen der Inhalte der Liste, die in fernsehprogramm.java erstellt wurde
	
	@PostMapping 
	@ResponseStatus(HttpStatus.CREATED)
	public FernsehprogrammEintrag createNewEintrag(@RequestBody NewRequest request) {
		FernsehprogrammEintrag eintrag = new FernsehprogrammEintrag();
		eintrag.setFernsehsender(request.name);
		this.fernsehprogramm.addEingang(eintrag);
		return eintrag;
	}
	
	//Fügt zu der Liste einen neuen Eintrag hinzu
	
	public static class NewRequest{
		public String name = "";
	}
}
