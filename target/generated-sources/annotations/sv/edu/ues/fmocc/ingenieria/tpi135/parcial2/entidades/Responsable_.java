package sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.EstadoMantenimientoDetalle;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.TipoResponsable;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-04T18:50:23")
@StaticMetamodel(Responsable.class)
public class Responsable_ { 

    public static volatile SingularAttribute<Responsable, String> descripcion;
    public static volatile SingularAttribute<Responsable, TipoResponsable> idTipoResponsable;
    public static volatile SingularAttribute<Responsable, Integer> idResponsable;
    public static volatile SingularAttribute<Responsable, String> nombre;
    public static volatile SingularAttribute<Responsable, Boolean> activo;
    public static volatile CollectionAttribute<Responsable, EstadoMantenimientoDetalle> estadoMantenimientoDetalleCollection;

}