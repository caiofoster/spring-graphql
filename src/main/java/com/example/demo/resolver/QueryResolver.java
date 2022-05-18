package com.example.demo.resolver;

import com.example.demo.model.Calculo;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    public Calculo calcular(int valA, int valB, int valC) throws Exception {
        int valor = valA + valB + valC;
        throw new Exception("erro");
        //return new Calculo(valor, valor + "");
    }

}