package com.srmasset.api.operacao.srmasset.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.srmasset.api.operacao.srmasset.model.Operation;
import com.srmasset.api.operacao.srmasset.service.OperationService;

@RestController
@RequestMapping("/operation")
public class OperationResource {

	@Autowired
	OperationService service;

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String create(@RequestBody @Valid final Operation operation, Errors errors) {

		if (errors.hasErrors()) {

			return (errors.toString() + HttpStatus.BAD_REQUEST);
		} else {

			return service.create(operation);
		}

	}

	@GetMapping
	public List<Operation> list() {

		return service.list();
	}

	@DeleteMapping
	public List<Operation> delete(@PathVariable("id") long itemId, Model model) {

		return service.delete(itemId);

	}
}
