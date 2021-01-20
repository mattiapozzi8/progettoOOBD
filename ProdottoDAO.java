import java.sql.*;

public class ProdottoDAO {
	{
	
	Frutta frutto = new Frutta();	
		
	try {
		Class.forName("database-1.cyzurhfwamck.us-east-2.rds.amazonaws.com");
	} catch(ClassNotFoundException e) {
		System.out.println("Class not found!\n"+e);
	}
	
	try {
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://postgres:5432/postgres", "postgres", "progettooobd");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * from prodotto, frutta WHERE prodotto.codice_id=frutta.id;");
	
		while(rs.next()) {
			frutto.setNomeProdotto(rs.getString("nome_prodotto"));
			frutto.setMarca(rs.getString("marca"));
			frutto.setCodiceID(rs.getString("codice_id"));
			frutto.setPrezzoAlKilo(rs.getDouble("prezzo"));
			frutto.setDataDiScadenza(rs.getDate("data_scadenza"));
			frutto.setDisponibilit‡(rs.getInt("disponibilita"));
			frutto.setDataDiRaccolta(rs.getDate("data_raccolta"));
			frutto.setModalit‡DiConservazione(rs.getString("modalita_conservazione"));
			
		}
		
		rs.close();
		st.close();
		conn.close();
		
	} catch(SQLException e) {
		System.out.println("SQL Exception\n"+e);
	}
	

}
	}
