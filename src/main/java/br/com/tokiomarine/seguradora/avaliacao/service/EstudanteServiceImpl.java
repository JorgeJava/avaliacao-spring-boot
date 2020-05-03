package br.com.tokiomarine.seguradora.avaliacao.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;
import br.com.tokiomarine.seguradora.avaliacao.repository.EstudanteRepository;

// TODO Efetue a implementação dos métodos da classe service
@Service
public class EstudanteServiceImpl implements EstudandeService {

	@Autowired
	private EstudanteRepository repository;

	@Override
	public void cadastrarEstudante(@Valid Estudante estudante) {
		repository.save(estudante);
	}

	@Override
	public void atualizarEstudante(@Valid Estudante estudante) {
		repository.save(estudante);
	}

	@Override
	public List<Estudante> buscarEstudantes() {
		List<Estudante> listaEstudantes = new ArrayList<Estudante>();
		listaEstudantes.addAll(repository.findAll());
		
		return listaEstudantes;
	}

	@Override
	public Estudante buscarEstudantePorId(long id) {
		Estudante estudante = new Estudante();
		estudante = repository.findById(id);
		
		return estudante;
		
	}
	
	@Override
	public void excluirEstudante(long id){
		repository.deleteById(id);
	}

}
