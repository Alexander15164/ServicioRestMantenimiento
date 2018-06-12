package sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.EstadoMantenimientoDetalle;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.OrdenTrabajo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-04T18:50:23")
@StaticMetamodel(MantenimientoDetalle.class)
public class MantenimientoDetalle_ { 

    public static volatile SingularAttribute<MantenimientoDetalle, OrdenTrabajo> idOdenTrabajo;
    public static volatile SingularAttribute<MantenimientoDetalle, Long> idMantenimientoDetalle;
    public static volatile SingularAttribute<MantenimientoDetalle, Integer> idEquipoDetalle;
    public static volatile CollectionAttribute<MantenimientoDetalle, EstadoMantenimientoDetalle> estadoMantenimientoDetalleCollection;

}