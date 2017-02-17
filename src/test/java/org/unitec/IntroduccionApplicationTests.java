package org.unitec;

import java.util.Date;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntroduccionApplicationTests {

    @Autowired ServicioConversion servicio;
    @Autowired RepositorioFacil repoFacil;
	@Test
	public void contextLoads() {
	}
        
       @Test
       public void testGrados()throws Exception{
   Assert.assertEquals(3.937008f,servicio.hacerConversion().convertir(10f));
       }
       
      /* @Test
       public void guardarFacil()throws Exception{
           Facil facil=new Facil("primero","Puerco", new Date());
           Facil f=     repoFacil.save(facil);
           Assert.assertEquals(f.getId(),facil.getId());
       }
*/
       
       @Test
       public void buscarPorId()throws Exception{
 Assert.assertEquals("Puerco",repoFacil.findOne(1L).getCuerpo());
       }
       
       @Test
       public void buscarTodos()throws Exception{
        long tama=   repoFacil.count();
        Assert.assertEquals(1L, tama); 
       }
       
       //Tarea: Probar un update y un delete
       
       @Test
       public void ActualizarTodo()throws Exception{
           Facil f= repoFacil.findOne(1L);
           f.setTitulo("Titulo nuevo");
           repoFacil.save(f);
           Assert.assertEquals("Titulo nuevo", 
                   repoFacil.findOne(1L).getTitulo());
       }
       
       @Test
       public void buscarPorCuerpo()throws Exception{
           int tama= repoFacil.findByCuerpo("Puerco").size();
           Assert.assertEquals(1, tama);
           
       }

}
