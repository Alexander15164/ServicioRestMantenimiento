package sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.DiagnosticoParte;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.Procedimiento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-04T18:50:23")
@StaticMetamodel(Diagnostico.class)
public class Diagnostico_ { 

    public static volatile SingularAttribute<Diagnostico, String> descripcion;
    public static volatile CollectionAttribute<Diagnostico, DiagnosticoParte> diagnosticoParteCollection;
    public static volatile CollectionAttribute<Diagnostico, Procedimiento> procedimientoCollection;
    public static volatile SingularAttribute<Diagnostico, Integer> idDiagnostico;
    public static volatile SingularAttribute<Diagnostico, String> nombre;

}