export default [
  {
    path: '/comics',
    name: 'Comics',
    component: () => import('@/components/main/Comics'),
  },
  {
    path: '/comics/:title',
    name: 'ComicIndex',
    component: () => import('@/components/post/comic/ComicIndex'),
  },
  {
    path: '/comics/:title/content',
    name: 'ComicContent',
    component: () => import('@/components/post/comic/ComicContent'),
  },
  {
    path: '/comics/:comicId/view/:episode',
    name: 'ComicView',
    component: () => import('@/components/post/comic/ComicView')
  },
]