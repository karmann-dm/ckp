package org.ccfebras.ckp.web.controller.dictionary;

import org.ccfebras.ckp.model.Organization;
import org.ccfebras.ckp.service.DictionaryService;
import org.ccfebras.ckp.web.dto.request.CreateOrganizationRequest;
import org.ccfebras.ckp.web.dto.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/organization")
public class OrganizationController {
    @Autowired
    private DictionaryService dictionaryService;

    @PostMapping("/")
    public ResponseEntity<Organization> createOrganization(@Valid @RequestBody CreateOrganizationRequest request) {
        Organization organization = new Organization();
        organization.setShortName(request.getShortName());
        organization.setFullName(request.getFullName());
        organization.setDepartment(dictionaryService.findDepartmentById(request.getDepartmentId()));
        return new ResponseEntity<>(dictionaryService.saveOrganization(organization), HttpStatus.CREATED);
    }
}
