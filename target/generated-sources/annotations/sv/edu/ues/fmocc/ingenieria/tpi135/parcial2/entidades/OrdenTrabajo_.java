package sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.Equipo;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.MantenimientoDetalle;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.Prioridad;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.Solicitud;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.TipoMantenimiento;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.Unidad;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-04T18:50:23")
@StaticMetamodel(OrdenTrabajo.class)
public class OrdenTrabajo_ { 

    public static volatile SingularAttribute<OrdenTrabajo, Long> idOrdenTrabajo;
    public static volatile SingularAttribute<OrdenTrabajo, Equipo> idEquipo;
    public static volatile SingularAttribute<OrdenTrabajo, TipoMantenimiento> idTipoMantenimiento;
    public static volatile SingularAttribute<OrdenTrabajo, Date> fechaInicio;
    public static volatile SingularAttribute<OrdenTrabajo, Unidad> idUnidad;
    public static volatile SingularAttribute<OrdenTrabajo, String> observaciones;
    public static volatile CollectionAttribute<OrdenTrabajo, MantenimientoDetalle> mantenimientoDetalleCollection;
    public static volatile SingularAttribute<OrdenTrabajo, Date> fechaEstimada;
    public static volatile SingularAttribute<OrdenTrabajo, Prioridad> idPrioridad;
    public static volatile SingularAttribute<OrdenTrabajo, Solicitud> idSolicitud;

}