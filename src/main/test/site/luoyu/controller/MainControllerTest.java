package site.luoyu.controller; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import site.luoyu.SpringContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/** 
* MainController Tester. 
* 
* @author <Authors name> 
* @since <pre>11/30/2016</pre> 
* @version 1.0 
*/
public class MainControllerTest extends SpringContext{

    @Autowired
    MainController mainController;

    @Autowired
    WebApplicationContext context;

    private MockMvc mockMvc;

    @Before
    public void before() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @After
    public void after() throws Exception {
    }


    @Test
    public void testHomeRedirect() throws Exception {
        mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk());
    }


} 
