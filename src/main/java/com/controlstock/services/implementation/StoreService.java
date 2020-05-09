package com.controlstock.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.controlstock.converters.StoreConverter;
import com.controlstock.entities.Store;
import com.controlstock.models.StoreModel;
import com.controlstock.repositories.IStoreRepository;
import com.controlstock.services.IStoreService;

<<<<<<< HEAD
	@Service("storeService")
	public class StoreService implements IStoreService {

		
		@Autowired
		@Qualifier("storeRepository")
		private IStoreRepository storeRepository;
		
		@Autowired
		@Qualifier("storeConverter")
		private StoreConverter storeConverter;
		
		@Override
		public List<Sucursal> getAll() {
			return storeRepository.findAll();
		}
		
		@Override
		public StoreModel insertOrUpdate(StoreModel storeModel) {
			Sucursal store = storeRepository.save(storeConverter.modelToEntity(storeModel));
			return storeConverter.entityToModel(store);
		}
		
		@Override
		public boolean remove(int id) {
			try {
				storeRepository.deleteById(id);
				return true;
			} catch(Exception e) {
				return false;
			}
		}
		
		@Override
		public StoreModel findById(int id) {
			return storeConverter.entityToModel(storeRepository.findById(id));
		}
		
=======
@Service("storeService")
public class StoreService implements IStoreService {

	@Autowired
	@Qualifier("storeRepository")
	private IStoreRepository storeRepository;

	@Autowired
	@Qualifier("storeConverter")
	private StoreConverter storeConverter;

	@Override
	public List<Store> getAll() {
		return storeRepository.findAll();
>>>>>>> refs/remotes/origin/dev
	}

	@Override
	public StoreModel insertOrUpdate(StoreModel storeModel) {
		Store store = storeRepository.save(storeConverter.modelToEntity(storeModel));
		return storeConverter.entityToModel(store);
	}

	@Override
	public boolean remove(int id) {
		try {
			storeRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public StoreModel findById(int id) {
		return storeConverter.entityToModel(storeRepository.findById(id));
	}

}
