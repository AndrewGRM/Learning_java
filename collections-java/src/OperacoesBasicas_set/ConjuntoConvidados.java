import OperacoesBasicas_set.Convidado;

public static class conjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public conjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }
}

public static void main(String[] args) {
    conjuntoConvidados conjuntoConvidados = new conjuntoConvidados();
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados");

    conjuntoConvidados.adicionarConvidado("operacoesBasicas_set.Convidado 1", 1234);
    conjuntoConvidados.adicionarConvidado("operacoesBasicas_set.Convidado 2", 5678);
    conjuntoConvidados.adicionarConvidado("operacoesBasicas_set.Convidado 3", 9876);
    conjuntoConvidados.adicionarConvidado("operacoesBasicas_set.Convidado 4", 5432);

    conjuntoConvidados.exibirConvidados();

    conjuntoConvidados.removerConvidadoPorConvite(5432);

    System.out.println("Existem " + conjuntoConvidados.contarConvidados()+ " convidados");
}

