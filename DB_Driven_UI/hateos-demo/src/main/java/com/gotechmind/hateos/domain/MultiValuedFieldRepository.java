package com.gotechmind.hateos.domain;

import org.springframework.data.repository.CrudRepository;

public interface MultiValuedFieldRepository extends CrudRepository<MultiValuedField, Long>{

	Iterable<MultiValuedField> findByParentFieldId(Long parentFieldId);

}
