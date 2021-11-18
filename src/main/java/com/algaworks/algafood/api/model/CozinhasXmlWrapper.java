package com.algaworks.algafood.api.model;

import java.util.List;

import com.algaworks.algafood.domain.model.Cozinha;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;
import lombok.NonNull;

@JacksonXmlRootElement(localName = "cozinhas") // ESPECÍFICO PARA XML MUDA O NOME DA TAG XML (POSTMAN)
@Data
public class CozinhasXmlWrapper {

	@JacksonXmlProperty(localName = "cozinha")
	@JacksonXmlElementWrapper(useWrapping = false) // ESTOU DESABILITANDO UM EMBRULHO
	@NonNull
	private List<Cozinha> cozinhas;
}
