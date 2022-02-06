package br.com.AdilsonJager.Forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.AdilsonJager.Forum.controller.dto.TopicoDto;
import br.com.AdilsonJager.Forum.modelo.Curso;
import br.com.AdilsonJager.Forum.modelo.Topico;

@RestController
public class TopicosController {

    /*
    If I user Controler I need user the responseBody, but 
    if I user RestControlerr I don`t need user the responsibody
    */
    @RequestMapping("/topicos")
    public List<TopicoDto> lista(){
        Topico topico = new Topico("Duvida", "Duvida Spring", new Curso("SpringBoot", "Programacao"));

        return TopicoDto.converter(Arrays.asList(topico, topico, topico, topico));
    }
}
