package br.com.tokiomarine.seguradora.avaliacao.service;

import java.util.List;

import javax.validation.Valid;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;

public interface EstudandeService {

	public List<Estudante> buscarEstudantes();

	public void cadastrarEstudante(@Valid Estudante estudante);

	public Estudante buscarEstudantePorId(long id);

	public void atualizarEstudante(@Valid Estudante estudante);

	public void excluirEstudante(long id);

}
