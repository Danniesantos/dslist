package com.daniela.dsList.service;

import com.daniela.dsList.dto.GameMinDTO;
import com.daniela.dsList.entities.Game;
import com.daniela.dsList.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
