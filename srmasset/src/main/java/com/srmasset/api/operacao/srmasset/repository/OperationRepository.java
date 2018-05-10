package com.srmasset.api.operacao.srmasset.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.srmasset.api.operacao.srmasset.model.Operation;


public interface OperationRepository extends  JpaRepository<Operation,Long> {

}
