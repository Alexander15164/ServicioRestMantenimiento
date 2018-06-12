package sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.EquipoDetalle;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.OrdenTrabajo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-04T18:50:23")
@StaticMetamodel(Equipo.class)
public class Equipo_ { 

    public static volatile SingularAttribute<Equipo, Integer> idEquipo;
    public static volatile CollectionAttribute<Equipo, OrdenTrabajo> ordenTrabajoCollection;
    public static volatile SingularAttribute<Equipo, String> observaciones;
    public static volatile SingularAttribute<Equipo, String> correlativo;
    public static volatile CollectionAttribute<Equipo, EquipoDetalle> equipoDetalleCollection;

}