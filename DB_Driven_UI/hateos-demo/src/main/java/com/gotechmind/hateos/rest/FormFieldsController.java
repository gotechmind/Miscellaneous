package com.gotechmind.hateos.rest;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import javax.annotation.Resource;

import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gotechmind.hateos.domain.FormField;
import com.gotechmind.hateos.domain.FormFieldRepository;
import com.gotechmind.hateos.domain.MultiValuedField;
import com.gotechmind.hateos.domain.MultiValuedFieldRepository;

@RestController

public class FormFieldsController {

	@Resource 
	FormFieldRepository formFieldRepository;

	@Resource 
	MultiValuedFieldRepository multiValuedFieldRepository;

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/formfields")
	public Iterable<FormField> getFormFields() {
		Iterable<FormField> formFields = formFieldRepository.findAll();
		formFields.forEach(this::addResourceURLtoMultiValuedFields);
		return formFields;
	}

	private void addResourceURLtoMultiValuedFields(FormField formField) {

		if(!formField.isMultiValued()) {
			return;
		}

		Link selfRef = linkTo(methodOn(FormFieldsController.class).getMultiValuedFieldValues(formField.getFieldId())).withSelfRel();
		formField.add(selfRef);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/formfields/{fieldId}/values")
	public Iterable<MultiValuedField> getMultiValuedFieldValues(@PathVariable Long fieldId) {
		return multiValuedFieldRepository.findByParentFieldId(fieldId);
	}
}
