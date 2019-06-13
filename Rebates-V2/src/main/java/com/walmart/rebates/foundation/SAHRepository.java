///*
// * SAH Specific repository class for imposing the CRUD operations restrictions like DPP
// * */

package com.walmart.rebates.foundation;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface SAHRepository<T, ID extends Serializable> extends CrudRepository<T, ID>{

}
