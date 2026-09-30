package acolhimentoprisional.model;

public class Detento {

    private int id;
    private String responsavelAtendimento;
    private String dataEntrada;
    private String dataAtendimento;
    private String procedenciaTransferencia;
    private String nomeCompleto;
    private String nomeSocial;
    private String dataNascimento;
    private int idade;
    private String cpf;
    private String nacionalidade;
    private String paisOrigem;
    private String nomeMae;
    private String estadoCivil;
    private String etnia;
    private String sexoBiologico;
    private String identidadeDeGenero;
    private String orientacaoSexual;
    private String escolaridade;
    private String profissao;
    private String beneficioFamiliar;
    private int quantFilhos;
    private int quantDependentes;
    private boolean encaminhamentoNEEJA;
    private boolean conversaAssitSocial;
    private String deficiencia;
    private String intoleranciaAlimentar;
    private String cirurgias;
    private String condicoesCronicas;
    private String doencasInfecciosas;
    private String doencaDePele;
    private String autoimune;
    private String hepatiteB;
    private String hepatiteC;
    private String medicamentoContinuo;
    private String tipoSanguineo;
    private int idadeGestacional;
    private String metodoContraceptivo;
    private String examePreventivo;
    private boolean continuidadeContraceptivo;
    private boolean consultaExamePreventivo;
    private boolean encaminhamentPreNatal;
    private int anoExameCancerProstata;
    private String familiarHistoricoCancerProstata;
    private boolean vasectomia;
    private boolean parceiraGestante;
    private boolean participacaoPreNatal;
    private boolean encaminhamentoVasectomia;
    private boolean encaminhamentoPreNetalParceira;
    private String vinculoCAPS;
    private String transtornosMentais;
    private String acompanhamentoSaudeMental;
    private String usoDrogas;
    private String realizouTratamentoParaUso;
    private String desejaRealizarTratamentoParaUso;
    private boolean consultaPsiciologia;
    private boolean consultaPsiquiatria;
    private boolean encaminhamentoRenovacaoReceita;
    private boolean encaminhamentoGrupoDeApoio;
    private boolean recebeuVacinaCovid;
    private boolean recebeuVacinaInfluenza;
    private boolean recebeuVacinaTetano;
    private boolean recebeuVacinaHepatiteB;
    private String vacinasAOfertar;
    private boolean copiaCarteiraVacinacao;
    private float peso;
    private float altura;
    private float imc;
    private String pa;
    private float fc;
    private float sat;
    private float temp;
    private String sintomas;
    private String dataSintomas;
    private String lesoes;
    private String conduta;
    private String testeHiv1_2;
    private String testeHiv2_2;
    private String testeSifilis;
    private String testeHepatiteB;
    private String testeHepatiteC;
    private String testeCovid;
    private String testeGravidez;
    private boolean coletaEscarro;
    private String queixa;
    private String condutaQueixa;
    private String queixaOdontologica;
    private boolean avaliacaoImediataDentista;
    private String condutaDentista;
    private String encaminhamentosFinais;

    public Detento() {
    }

    public int getId() {
        return id;
    }

    public String getResponsavelAtendimento() {
        return responsavelAtendimento;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getDataAtendimento() {
        return dataAtendimento;
    }

    public String getProcedenciaTransferencia() {
        return procedenciaTransferencia;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getEtnia() {
        return etnia;
    }

    public String getSexoBiologico() {
        return sexoBiologico;
    }

    public String getIdentidadeDeGenero() {
        return identidadeDeGenero;
    }

    public String getOrientacaoSexual() {
        return orientacaoSexual;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setResponsavelAtendimento(String responsavelAtendimento) {
        this.responsavelAtendimento = responsavelAtendimento;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataAtendimento(String dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public void setProcedenciaTransferencia(String procedenciaTransferencia) {
        this.procedenciaTransferencia = procedenciaTransferencia;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public void setSexoBiologico(String sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }

    public void setIdentidadeDeGenero(String identidadeDeGenero) {
        this.identidadeDeGenero = identidadeDeGenero;
    }

    public void setOrientacaoSexual(String orientacaoSexual) {
        this.orientacaoSexual = orientacaoSexual;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getBeneficioFamiliar() {
        return beneficioFamiliar;
    }

    public void setBeneficioFamiliar(String beneficioFamiliar) {
        this.beneficioFamiliar = beneficioFamiliar;
    }

    public int getQuantFilhos() {
        return quantFilhos;
    }

    public void setQuantFilhos(int quantFilhos) {
        this.quantFilhos = quantFilhos;
    }

    public int getQuantDependentes() {
        return quantDependentes;
    }

    public void setQuantDependentes(int quantDependentes) {
        this.quantDependentes = quantDependentes;
    }

    public boolean isEncaminhamentoNEEJA() {
        return encaminhamentoNEEJA;
    }

    public void setEncaminhamentoNEEJA(boolean encaminhamentoNEEJA) {
        this.encaminhamentoNEEJA = encaminhamentoNEEJA;
    }

    public boolean isConversaAssitSocial() {
        return conversaAssitSocial;
    }

    public void setConversaAssitSocial(boolean conversaAssitSocial) {
        this.conversaAssitSocial = conversaAssitSocial;
    }

    public String getDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(String deficiencia) {
        this.deficiencia = deficiencia;
    }

    public String getIntoleranciaAlimentar() {
        return intoleranciaAlimentar;
    }

    public void setIntoleranciaAlimentar(String intoleranciaAlimentar) {
        this.intoleranciaAlimentar = intoleranciaAlimentar;
    }

    public String getCirurgias() {
        return cirurgias;
    }

    public void setCirurgias(String cirurgias) {
        this.cirurgias = cirurgias;
    }

    public String getCondicoesCronicas() {
        return condicoesCronicas;
    }

    public void setCondicoesCronicas(String condicoesCronicas) {
        this.condicoesCronicas = condicoesCronicas;
    }

    public String getDoencasInfecciosas() {
        return doencasInfecciosas;
    }

    public void setDoencasInfecciosas(String doencasInfecciosas) {
        this.doencasInfecciosas = doencasInfecciosas;
    }

    public String getDoencaDePele() {
        return doencaDePele;
    }

    public void setDoencaDePele(String doencaDePele) {
        this.doencaDePele = doencaDePele;
    }

    public String getAutoimune() {
        return autoimune;
    }

    public void setAutoimune(String autoimune) {
        this.autoimune = autoimune;
    }

    public String getHepatiteB() {
        return hepatiteB;
    }

    public void setHepatiteB(String hepatiteB) {
        this.hepatiteB = hepatiteB;
    }

    public String getHepatiteC() {
        return hepatiteC;
    }

    public void setHepatiteC(String hepatiteC) {
        this.hepatiteC = hepatiteC;
    }

    public String getMedicamentoContinuo() {
        return medicamentoContinuo;
    }

    public void setMedicamentoContinuo(String medicamentoContinuo) {
        this.medicamentoContinuo = medicamentoContinuo;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getIdadeGestacional() {
        return idadeGestacional;
    }

    public void setIdadeGestacional(int idadeGestacional) {
        this.idadeGestacional = idadeGestacional;
    }

    public String getMetodoContraceptivo() {
        return metodoContraceptivo;
    }

    public void setMetodoContraceptivo(String metodoContraceptivo) {
        this.metodoContraceptivo = metodoContraceptivo;
    }

    public String getExamePreventivo() {
        return examePreventivo;
    }

    public void setExamePreventivo(String examePreventivo) {
        this.examePreventivo = examePreventivo;
    }

    public boolean isContinuidadeContraceptivo() {
        return continuidadeContraceptivo;
    }

    public void setContinuidadeContraceptivo(boolean continuidadeContraceptivo) {
        this.continuidadeContraceptivo = continuidadeContraceptivo;
    }

    public boolean isConsultaExamePreventivo() {
        return consultaExamePreventivo;
    }

    public void setConsultaExamePreventivo(boolean consultaExamePreventivo) {
        this.consultaExamePreventivo = consultaExamePreventivo;
    }

    public boolean isEncaminhamentPreNatal() {
        return encaminhamentPreNatal;
    }

    public void setEncaminhamentPreNatal(boolean encaminhamentPreNatal) {
        this.encaminhamentPreNatal = encaminhamentPreNatal;
    }

    public int getAnoExameCancerProstata() {
        return anoExameCancerProstata;
    }

    public void setAnoExameCancerProstata(int anoExameCancerProstata) {
        this.anoExameCancerProstata = anoExameCancerProstata;
    }

    public String getFamiliarHistoricoCancerProstata() {
        return familiarHistoricoCancerProstata;
    }

    public void setFamiliarHistoricoCancerProstata(String familiarHistoricoCancerProstata) {
        this.familiarHistoricoCancerProstata = familiarHistoricoCancerProstata;
    }

    public boolean isVasectomia() {
        return vasectomia;
    }

    public void setVasectomia(boolean vasectomia) {
        this.vasectomia = vasectomia;
    }

    public boolean isParceiraGestante() {
        return parceiraGestante;
    }

    public void setParceiraGestante(boolean parceiraGestante) {
        this.parceiraGestante = parceiraGestante;
    }

    public boolean isParticipacaoPreNatal() {
        return participacaoPreNatal;
    }

    public void setParticipacaoPreNatal(boolean participacaoPreNatal) {
        this.participacaoPreNatal = participacaoPreNatal;
    }

    public boolean isEncaminhamentoVasectomia() {
        return encaminhamentoVasectomia;
    }

    public void setEncaminhamentoVasectomia(boolean encaminhamentoVasectomia) {
        this.encaminhamentoVasectomia = encaminhamentoVasectomia;
    }

    public boolean isEncaminhamentoPreNetalParceira() {
        return encaminhamentoPreNetalParceira;
    }

    public void setEncaminhamentoPreNetalParceira(boolean encaminhamentoPreNetalParceira) {
        this.encaminhamentoPreNetalParceira = encaminhamentoPreNetalParceira;
    }

    public String getVinculoCAPS() {
        return vinculoCAPS;
    }

    public void setVinculoCAPS(String vinculoCAPS) {
        this.vinculoCAPS = vinculoCAPS;
    }

    public String getTranstornosMentais() {
        return transtornosMentais;
    }

    public void setTranstornosMentais(String transtornosMentais) {
        this.transtornosMentais = transtornosMentais;
    }

    public String getAcompanhamentoSaudeMental() {
        return acompanhamentoSaudeMental;
    }

    public void setAcompanhamentoSaudeMental(String acompanhamentoSaudeMental) {
        this.acompanhamentoSaudeMental = acompanhamentoSaudeMental;
    }

    public String getUsoDrogas() {
        return usoDrogas;
    }

    public void setUsoDrogas(String usoDrogas) {
        this.usoDrogas = usoDrogas;
    }

    public String getRealizouTratamentoParaUso() {
        return realizouTratamentoParaUso;
    }

    public void setRealizouTratamentoParaUso(String realizouTratamentoParaUso) {
        this.realizouTratamentoParaUso = realizouTratamentoParaUso;
    }

    public String getDesejaRealizarTratamentoParaUso() {
        return desejaRealizarTratamentoParaUso;
    }

    public void setDesejaRealizarTratamentoParaUso(String desejaRealizarTratamentoParaUso) {
        this.desejaRealizarTratamentoParaUso = desejaRealizarTratamentoParaUso;
    }

    public boolean isConsultaPsiciologia() {
        return consultaPsiciologia;
    }

    public void setConsultaPsiciologia(boolean consultaPsiciologia) {
        this.consultaPsiciologia = consultaPsiciologia;
    }

    public boolean isConsultaPsiquiatria() {
        return consultaPsiquiatria;
    }

    public void setConsultaPsiquiatria(boolean consultaPsiquiatria) {
        this.consultaPsiquiatria = consultaPsiquiatria;
    }

    public boolean isEncaminhamentoRenovacaoReceita() {
        return encaminhamentoRenovacaoReceita;
    }

    public void setEncaminhamentoRenovacaoReceita(boolean encaminhamentoRenovacaoReceita) {
        this.encaminhamentoRenovacaoReceita = encaminhamentoRenovacaoReceita;
    }

    public boolean isEncaminhamentoGrupoDeApoio() {
        return encaminhamentoGrupoDeApoio;
    }

    public void setEncaminhamentoGrupoDeApoio(boolean encaminhamentoGrupoDeApoio) {
        this.encaminhamentoGrupoDeApoio = encaminhamentoGrupoDeApoio;
    }

    public boolean isRecebeuVacinaCovid() {
        return recebeuVacinaCovid;
    }

    public void setRecebeuVacinaCovid(boolean recebeuVacinaCovid) {
        this.recebeuVacinaCovid = recebeuVacinaCovid;
    }

    public boolean isRecebeuVacinaInfluenza() {
        return recebeuVacinaInfluenza;
    }

    public void setRecebeuVacinaInfluenza(boolean recebeuVacinaInfluenza) {
        this.recebeuVacinaInfluenza = recebeuVacinaInfluenza;
    }

    public boolean isRecebeuVacinaTetano() {
        return recebeuVacinaTetano;
    }

    public void setRecebeuVacinaTetano(boolean recebeuVacinaTetano) {
        this.recebeuVacinaTetano = recebeuVacinaTetano;
    }

    public boolean isRecebeuVacinaHepatiteB() {
        return recebeuVacinaHepatiteB;
    }

    public void setRecebeuVacinaHepatiteB(boolean recebeuVacinaHepatiteB) {
        this.recebeuVacinaHepatiteB = recebeuVacinaHepatiteB;
    }

    public String getVacinasAOfertar() {
        return vacinasAOfertar;
    }

    public void setVacinasAOfertar(String vacinasAOfertar) {
        this.vacinasAOfertar = vacinasAOfertar;
    }

    public boolean isCopiaCarteiraVacinacao() {
        return copiaCarteiraVacinacao;
    }

    public void setCopiaCarteiraVacinacao(boolean copiaCarteiraVacinacao) {
        this.copiaCarteiraVacinacao = copiaCarteiraVacinacao;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    public float getFc() {
        return fc;
    }

    public void setFc(float fc) {
        this.fc = fc;
    }

    public float getSat() {
        return sat;
    }

    public void setSat(float sat) {
        this.sat = sat;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDataSintomas() {
        return dataSintomas;
    }

    public void setDataSintomas(String dataSintomas) {
        this.dataSintomas = dataSintomas;
    }

    public String getLesoes() {
        return lesoes;
    }

    public void setLesoes(String lesoes) {
        this.lesoes = lesoes;
    }

    public String getConduta() {
        return conduta;
    }

    public void setConduta(String conduta) {
        this.conduta = conduta;
    }

    public String getTesteHiv1_2() {
        return testeHiv1_2;
    }

    public void setTesteHiv1_2(String testeHiv1_2) {
        this.testeHiv1_2 = testeHiv1_2;
    }

    public String getTesteHiv2_2() {
        return testeHiv2_2;
    }

    public void setTesteHiv2_2(String testeHiv2_2) {
        this.testeHiv2_2 = testeHiv2_2;
    }

    public String getTesteSifilis() {
        return testeSifilis;
    }

    public void setTesteSifilis(String testeSifilis) {
        this.testeSifilis = testeSifilis;
    }

    public String getTesteHepatiteB() {
        return testeHepatiteB;
    }

    public void setTesteHepatiteB(String testeHepatiteB) {
        this.testeHepatiteB = testeHepatiteB;
    }

    public String getTesteHepatiteC() {
        return testeHepatiteC;
    }

    public void setTesteHepatiteC(String testeHepatiteC) {
        this.testeHepatiteC = testeHepatiteC;
    }

    public String getTesteCovid() {
        return testeCovid;
    }

    public void setTesteCovid(String testeCovid) {
        this.testeCovid = testeCovid;
    }

    public String getTesteGravidez() {
        return testeGravidez;
    }

    public void setTesteGravidez(String testeGravidez) {
        this.testeGravidez = testeGravidez;
    }

    public boolean isColetaEscarro() {
        return coletaEscarro;
    }

    public void setColetaEscarro(boolean coletaEscarro) {
        this.coletaEscarro = coletaEscarro;
    }

    public String getQueixa() {
        return queixa;
    }

    public void setQueixa(String queixa) {
        this.queixa = queixa;
    }

    public String getCondutaQueixa() {
        return condutaQueixa;
    }

    public void setCondutaQueixa(String condutaQueixa) {
        this.condutaQueixa = condutaQueixa;
    }

    public String getQueixaOdontologica() {
        return queixaOdontologica;
    }

    public void setQueixaOdontologica(String queixaOdontologica) {
        this.queixaOdontologica = queixaOdontologica;
    }

    public boolean isAvaliacaoImediataDentista() {
        return avaliacaoImediataDentista;
    }

    public void setAvaliacaoImediataDentista(boolean avaliacaoImediataDentista) {
        this.avaliacaoImediataDentista = avaliacaoImediataDentista;
    }

    public String getCondutaDentista() {
        return condutaDentista;
    }

    public void setCondutaDentista(String condutaDentista) {
        this.condutaDentista = condutaDentista;
    }

    public String getEncaminhamentosFinais() {
        return encaminhamentosFinais;
    }

    public void setEncaminhamentosFinais(String encaminhamentosFinais) {
        this.encaminhamentosFinais = encaminhamentosFinais;
    }

}
