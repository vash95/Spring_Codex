package es.inditex.test;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PricesControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void test1() throws Exception {

        String jsonContent = "{ \"productId\": 35455, \"date\": \"2020-06-14T10:00:00.000Z\", \"brandId\": 1 }";

        MvcResult result =  mockMvc.perform(MockMvcRequestBuilders
                .post("/api/prices/search")
                .content(jsonContent)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andReturn();



    }

    @Test
    public void test2() throws Exception {

        String jsonContent = "{ \"productId\": 35455, \"date\": \"2020-06-14T16:00:00.000Z\", \"brandId\": 1 }";

        MvcResult result =  mockMvc.perform(MockMvcRequestBuilders
                .post("/api/prices/search")
                .content(jsonContent)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andReturn();



    }

    @Test
    public void test3() throws Exception {

        String jsonContent = "{ \"productId\": 35455, \"date\": \"2020-06-14T21:00:00.000Z\", \"brandId\": 1 }";

        MvcResult result =  mockMvc.perform(MockMvcRequestBuilders
                .post("/api/prices/search")
                .content(jsonContent)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andReturn();



    }

    @Test
    public void test4() throws Exception {

        String jsonContent = "{ \"productId\": 35455, \"date\": \"2020-06-15T10:00:00.000Z\", \"brandId\": 1 }";

        MvcResult result =  mockMvc.perform(MockMvcRequestBuilders
                .post("/api/prices/search")
                .content(jsonContent)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andReturn();



    }

    @Test
    public void test5() throws Exception {

        String jsonContent = "{ \"productId\": 35455, \"date\": \"2020-06-16T21:00:00.000Z\", \"brandId\": 1 }";

        MvcResult result =  mockMvc.perform(MockMvcRequestBuilders
                .post("/api/prices/search")
                .content(jsonContent)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andReturn();



    }







}
