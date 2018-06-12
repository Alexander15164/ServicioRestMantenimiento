package sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.OrdenTrabajo;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.SubTipoMantenimiento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-04T18:50:23")
@StaticMetamodel(TipoMantenimiento.class)
public class TipoMantenimiento_ { 

    public static volatile CollectionAttribute<TipoMantenimiento, OrdenTrabajo> ordenTrabajoCollection;
    public static volatile SingularAttribute<TipoMantenimiento, SubTipoMantenimiento> idSubTipoMantenimiento;
    public static volatile SingularAttribute<TipoMantenimiento, Integer> idTipoMantenimiento;
    public static volatile SingularAttribute<TipoMantenimiento, String> descipcion;
    public static volatile SingularAttribute<TipoMantenimiento, String> nombre;
    public static volatile SingularAttribute<TipoMantenimiento, Boolean> activo;

}