package com.srmasset.api.operacao.srmasset.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.srmasset.api.operacao.srmasset.model.Operation;
import com.srmasset.api.operacao.srmasset.repository.OperationRepository;

@Service
public class OperationService {

	@Autowired
	OperationRepository operationRepository;

	public String create(Operation operation) {

		if (operation.getRiskClient().equalsIgnoreCase("b")) {

			operation.setInterest((operation.getLimitClient() * 10) / 100);
		} else if (operation.getRiskClient().equalsIgnoreCase("c")) {

			operation.setInterest((operation.getLimitClient() * 20) / 100);
		}

		if (operationRepository.save(operation) == null) {
			return ("Erro ao salvar no banco " + HttpStatus.FORBIDDEN);
		} else {

			return ("Sucesso" + HttpStatus.ACCEPTED);
		}
	}

	public List<Operation> list() {

		return operationRepository.findAll();
	}

	public List<Operation> delete(long id) {

		operationRepository.deleteById(id);
		return operationRepository.findAll();

	}

}
