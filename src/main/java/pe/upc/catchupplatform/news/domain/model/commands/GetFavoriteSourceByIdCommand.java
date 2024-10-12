package pe.upc.catchupplatform.news.domain.model.commands;

public record GetFavoriteSourceByIdCommand(Long id) {
    public GetFavoriteSourceByIdCommand{
        if (id == null) {
            throw new IllegalArgumentException("id is required");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("id must be greater than 0");
        }
    }
}
