/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.santiagogonzalez.ejemplos.msescuelaalumnos;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author santiago
*/
public interface GreetingController {
    @RequestMapping("/greeting")
    String greeting();
}
