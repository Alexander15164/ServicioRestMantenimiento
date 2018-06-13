/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.mockito.internal.util.reflection.Whitebox;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller.MarcaFacadeLocal;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.Marca;

/**
 *
 * @author aviles
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(MarcaFacadeLocal.class)
public class FindByNameTest {

    final MarcaFacadeLocal mockmarcafacadelocal = Mockito.mock(MarcaFacadeLocal.class);

    public static List<Marca> marcas() {
        List<Marca> marcas = new ArrayList<>();
        List<String> nombres = Arrays.asList("HP", "DELL", "TOSHIBA");
        for (int i = 0; i < nombres.size(); i++) {
            Marca m = new Marca();
            m.setIdMarca(i + 1);
            m.setNombre(nombres.get(i));
            marcas.add(m);
        }
        return marcas;
    }

    public FindByNameTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        Mockito.when(this.mockmarcafacadelocal.findByNameLike(Matchers.anyString(), Matchers.anyInt(), Matchers.anyInt())).thenReturn(marcas());
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of findByName method, of class FindByName.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testFindByName() throws Exception {
        System.out.println("findByName");
        String nombre = "Dell";
        int first = 1;
        int pagesize = 1;
        MarcaResource instance = new MarcaResource();
        Whitebox.setInternalState(instance, "mfl", mockmarcafacadelocal);
        Marca expResult = marcas().get(0);
        List <Marca> result = instance.findByName(nombre,first,pagesize); 
    }

}
