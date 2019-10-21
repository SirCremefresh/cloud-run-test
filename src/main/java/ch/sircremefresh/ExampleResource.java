package ch.sircremefresh;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/system")
public class ExampleResource {

    @Inject
    EntityManager em;

    @GET
    @Path("db-test")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public List<TestEntity> test() {
        TestEntity newTestEntity = new TestEntity();
        em.persist(newTestEntity);

        return em.createQuery("Select a from TestEntity a", TestEntity.class)
                .getResultList();
    }

    @GET
    @Path("ping")
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
        return "pong";
    }
}
