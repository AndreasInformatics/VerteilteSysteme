package dhbwka.wwi.vertsys.rest.demo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "fernsehprogrammEntries", path = "fernsehprogramm")
public interface FernsehprogrammEintragRepository extends PagingAndSortingRepository<FernsehprogrammEintrag, Long> {

}

//Repository, gibt Daten an DB sortiert weiter