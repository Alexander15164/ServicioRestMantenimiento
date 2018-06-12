package sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.DiagnosticoParte;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.TipoParte;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-04T18:50:23")
@StaticMetamodel(Parte.class)
public class Parte_ { 

    public static volatile SingularAttribute<Parte, String> descripcion;
    public static volatile CollectionAttribute<Parte, DiagnosticoParte> diagnosticoParteCollection;
    public static volatile SingularAttribute<Parte, TipoParte> idTipoParte;
    public static volatile SingularAttribute<Parte, String> nombre;
    public static volatile SingularAttribute<Parte, Integer> idParte;

}