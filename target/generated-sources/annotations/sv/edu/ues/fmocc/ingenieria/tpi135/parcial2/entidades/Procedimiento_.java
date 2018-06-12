package sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.Diagnostico;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.Paso;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-04T18:50:23")
@StaticMetamodel(Procedimiento.class)
public class Procedimiento_ { 

    public static volatile SingularAttribute<Procedimiento, String> descripcion;
    public static volatile SingularAttribute<Procedimiento, Integer> idProcedimiento;
    public static volatile SingularAttribute<Procedimiento, Diagnostico> idDiagnostico;
    public static volatile CollectionAttribute<Procedimiento, Paso> pasoCollection;
    public static volatile SingularAttribute<Procedimiento, String> nombre;
    public static volatile SingularAttribute<Procedimiento, Boolean> activo;

}