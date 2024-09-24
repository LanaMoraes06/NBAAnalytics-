package usa.com.nba.atletas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class operacoesController {
	
	@FXML
	Button btnEnviar;
	
	@FXML
	private static
	TextField txfNome;
	
	@FXML
	static
	TextField txfSobrenome;
	
	@FXML
	static
	TextField txfIdade;
	
	@FXML
	static
	TextField txfPosicao;
	
	@FXML
	 static
	TextField txfEquipe;
	
	 public static void inserirAluno(ActionEvent event) {
	     String sql = "INSERT INTO tabelaatletas (id, nome, sobrenome, idade, posicao, equipe) VALUES (?, ?, ?, ?, ?)";
	     try (Connection conexao = Conexao.conectar();
	          PreparedStatement pstmt = conexao.prepareStatement(sql)) {
	         pstmt.setInt(1, 1);
	         pstmt.setString(2, txfNome.getText());
	         pstmt.setString(3, txfSobrenome.getText());
	         pstmt.setString(4, txfIdade.getText());
	         pstmt.setString(4, txfPosicao.getText());
	         pstmt.setString(5, txfEquipe.getText());
	         pstmt.executeUpdate();
	     } catch (SQLException e) {
	         e.printStackTrace();
	     }
}}
