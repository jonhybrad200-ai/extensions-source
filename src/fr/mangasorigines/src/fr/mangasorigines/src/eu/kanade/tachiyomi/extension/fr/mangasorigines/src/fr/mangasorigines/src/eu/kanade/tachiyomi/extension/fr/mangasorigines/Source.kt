package eu.kanade.tachiyomi.extension.fr.mangasorigines

import eu.kanade.tachiyomi.source.Source
import javax.inject.Singleton

@Singleton
@Source(name = "Mangas-Origines.fr", lang = "fr")
class SourceSingleton : Source {
    override val id: Long = 987654321L // à ajuster plus tard
    override val name: String = "Mangas-Origines.fr"
    override val lang: String = "fr"
    override val baseUrl: String = "https://mangas-origines.fr"
}
