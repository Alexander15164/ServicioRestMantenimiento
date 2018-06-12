package sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.OrdenTrabajo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-04T18:50:23")
@StaticMetamodel(Solicitud.class)
public class Solicitud_ { 

    public static volatile CollectionAttribute<Solicitud, OrdenTrabajo> ordenTrabajoCollection;
    public static volatile SingularAttribute<Solicitud, Date> fechaSolicitud;
    public static volatile SingularAttribute<Solicitud, String> solicitante;
    public static volatile SingularAttribute<Solicitud, Integer> idSolicitud;
    public static volatile SingularAttribute<Solicitud, Boolean> activo;

}