package sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.OrdenTrabajo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-04T18:50:23")
@StaticMetamodel(Prioridad.class)
public class Prioridad_ { 

    public static volatile SingularAttribute<Prioridad, String> descripcion;
    public static volatile CollectionAttribute<Prioridad, OrdenTrabajo> ordenTrabajoCollection;
    public static volatile SingularAttribute<Prioridad, Integer> idPrioridad;
    public static volatile SingularAttribute<Prioridad, String> nombre;
    public static volatile SingularAttribute<Prioridad, Boolean> activo;

}