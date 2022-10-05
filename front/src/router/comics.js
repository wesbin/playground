export default [
  {
    path: '/comics',
    name: 'Comics',
    component: () => import('@/components/comics/Comics'),
  },
  {
    path: '/comics/:title',
    name: 'ComicIndex',
    component: () => import('@/components/comics/post/ComicIndex'),
  },
  {
    path: '/comics/:title/content',
    name: 'ComicContent',
    component: () => import('@/components/comics/post/ComicContent'),
  },
  {
    path: '/comics/:comicId/view/:episode',
    name: 'ComicView',
    component: () => import('@/components/comics/post/ComicView')
  },
]