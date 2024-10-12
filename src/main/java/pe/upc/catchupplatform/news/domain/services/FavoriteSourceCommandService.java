package pe.upc.catchupplatform.news.domain.services;

import pe.upc.catchupplatform.news.domain.model.aggregates.FavoriteSource;
import pe.upc.catchupplatform.news.domain.model.commands.GetFavoriteSourceByIdCommand;
import pe.upc.catchupplatform.news.domain.model.commands.GetFavoriteSourceCommand;


import java.util.List;
import java.util.Optional;

public interface FavoriteSourceCommandService {
    Optional<FavoriteSource> handle(GetFavoriteSourceByIdCommand command);

    Optional<List<FavoriteSource>> handle(GetFavoriteSourceCommand command);
}
