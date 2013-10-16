package com.worldmanager.platform.kpi.data.repository;

import com.worldmanager.platform.kpi.data.models.kpi.Template;

public class TemplateRepositoryImpl implements TemplateRepository {
    @Override
    public <S extends Template> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Template> Iterable<S> save(Iterable<S> entities) {
        return null;
    }

    @Override
    public Template findOne(Long aLong) {
        return null;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Template> findAll() {
        return null;
    }

    @Override
    public Iterable<Template> findAll(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public void delete(Template entity) {

    }

    @Override
    public void delete(Iterable<? extends Template> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
