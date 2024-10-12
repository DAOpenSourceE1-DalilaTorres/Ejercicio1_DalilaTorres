package pe.upc.catchupplatform.news.application;


import pe.upc.catchupplatform.news.domain.model.aggregates.FavoriteSource;
import pe.upc.catchupplatform.news.domain.commands.GetFavoriteSourceByIdCommand;
import pe.upc.catchupplatform.news.domain.commands.GetFavoriteSourceCommand;
import pe.upc.catchupplatform.news.domain.services.FavoriteSourceCommandService;

import java.util.List;
import java.util.Optional;

public class FavoriteSourceCommandServiceImpl implements FavoriteSourceCommandService {

    @Override
    public Optional<FavoriteSource> handle(GetFavoriteSourceByIdCommand command) {
        return Optional.empty();
    }

    @Override
    public Optional<List<FavoriteSource>> handle(GetFavoriteSourceCommand command) {
        return Optional.empty();
    }
}
