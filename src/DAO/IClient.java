package DAO;

import entities.Client;

public interface IClient {
public boolean addClient(Client client);
public Client getClientByID(int id);
}
