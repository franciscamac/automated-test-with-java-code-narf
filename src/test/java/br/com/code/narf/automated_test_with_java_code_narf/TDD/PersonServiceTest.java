package br.com.code.narf.automated_test_with_java_code_narf.TDD;

import br.com.code.narf.automated_test_with_java_code_narf.model.Person;
import br.com.code.narf.automated_test_with_java_code_narf.service.IPersonService;
import br.com.code.narf.automated_test_with_java_code_narf.service.PersonService;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonServiceTest {

    @DisplayName(" When Create a Person with sucess  should  return Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldReturnPersonObject(){
        //given / Arrange
        IPersonService service = new PersonService();
        Person person = new Person(
                "Narf",
                "Mac",
                "narf@gmail.com",
                "street 123",
                "Male"
        );
        //when / Act
        Person actual = service.createPerson(person);
        //then / Assert
        assertNotNull(actual, () -> "The created person should not be null");

    }
}
