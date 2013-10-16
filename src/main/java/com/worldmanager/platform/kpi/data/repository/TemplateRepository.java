package com.worldmanager.platform.kpi.data.repository;

import com.worldmanager.platform.kpi.data.models.kpi.Template;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateRepository extends CrudRepository<Template, Long> {
}
